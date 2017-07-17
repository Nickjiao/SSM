package com.jiao.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jiao.domain.Post;
import com.jiao.domain.Reply;
import com.jiao.domain.User;
import com.jiao.handleCookie.CookieUtil;
import com.jiao.handleCookie.JavaWebToken;
import com.jiao.service.PostService;
import com.jiao.service.ReplyServiceImpl;
import com.jiao.service.UserService;

@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
    @Autowired
    private PostService postService;
    @Autowired
    private ReplyServiceImpl replyService;
    
    @RequestMapping("/")
    public ModelAndView getWelfile(HttpServletRequest req,
    		HttpServletResponse response){ 
        ModelAndView mav = new ModelAndView("index");   
        return mav;    
    }   
    
    @RequestMapping("/login")
    public String getLogin(){      
        return "login";    
    } 
    
    @RequestMapping("/register")
    public String register(){      
        return "register";
    } 
    
    @RequestMapping("/regPos")
    public void reg(String username,
    		String email,
    		String password,
    		HttpServletRequest req,
    		HttpServletResponse response) {
    		userService.addNewUser(username, password, email);
    	try {
			req.getRequestDispatcher("/check").forward(req, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @RequestMapping("/check")
    public void check(HttpServletRequest req,
    		HttpServletResponse response){ 
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");
    	if(userService.selectIdByNamePwd(username,password) != null) {
    		//核对成功
        	Map<String, Object> loginInfo = new HashMap<>();
            loginInfo.put("isLoginSSM", "yes!");
            loginInfo.put("timestamp", new Date());
            String sessionId = JavaWebToken.createJavaWebToken(loginInfo);//token机制，详情请看上文所说的文章
            CookieUtil.addCookie(response,"isLoginSSM",sessionId);//加cookie
            HttpSession se = req.getSession();
            se.setAttribute("isLogin", true);
            int userId = userService.selectIdByNamePwd(username,password);
            Cookie cookie = new Cookie("userid",String.valueOf(userId));
            cookie.setPath("/");
    		cookie.setMaxAge(60 * 60 * 1 * 1);
            response.addCookie(cookie);
            req.getSession().setAttribute("isLogin", true);
            try {
				req.getRequestDispatcher("/").forward(req, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}else {
    		try {
				req.getRequestDispatcher("/login").forward(req, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    } 
    
    @RequestMapping("/tectalk")
    public String tectalk(Model model){  
    	model.addAttribute("date",new Date(System.currentTimeMillis()));
    	String title = "title_",
    			author = "author_",
    			pid = "pid_",
    			clicknum = "clicknum",
    			replynum = "replynum",
    			lastreplydate = "lastreplydate";
    	List<Post> postContent = postService.selectFirstTenPost();
    	for(int i = 0;i < postContent.size();i++) {
    		User user = userService.selectUserById(postContent.get(i).get_userpid());  
    		String s = String.valueOf(i+1);
    		model.addAttribute(pid+s,postContent.get(i).get_pid());
    		model.addAttribute(title+s,postContent.get(i).get_title());
        	model.addAttribute(author+s,user.getUserName());
        	model.addAttribute(clicknum+s,"dsg");
        	model.addAttribute(replynum+s,"dsg");
        	model.addAttribute(lastreplydate+s,"dsg");
    	}
        return "tectalk";
    } 
    
    // Download One File.
    @RequestMapping(value = "/download")
    public String doDownload() {
        // Forward to "/WEB-INF/pages/uploadOneFile.jsp".
        return "download";
    }
    
    // Upload One File.
    @RequestMapping(value = "/uploadOneFile")
    public String uploadOneFileHandler() {
        // Forward to "/WEB-INF/pages/uploadOneFile.jsp".
        return "uploadOneFile";
    }
 
    // Upload Multi File.
    @RequestMapping(value = "/uploadMultiFile")
    public String uploadMultiFileHandler() {
        // Forward to "/WEB-INF/pages/uploadMultiFile.jsp".
        return "uploadMultiFile";
    }
 
    // uploadOneFile.jsp, uploadMultiFile.jsp submit to.
    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String uploadFileHandler(HttpServletRequest request, Model model,
            @RequestParam("file") MultipartFile[] files) {
 
        // Root Directory.
        String uploadRootPath = "E:\\SSM\\upload";
 
        File uploadRootDir = new File(uploadRootPath);
        //
        // Create directory if it not exists.
        if (!uploadRootDir.exists()) {
            uploadRootDir.mkdirs();
        }
        //
        List<File> uploadedFiles = new ArrayList<File>();
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
 
            // Client File Name
            String name = file.getOriginalFilename();
            System.out.println("Client File Name = " + name);
 
            if (name != null && name.length() > 0) {
                try {
                    byte[] bytes = file.getBytes();
 
                    // Create the file on server
                    File serverFile = new File(uploadRootDir.getAbsolutePath()
                            + File.separator + name);
 
                    // Stream to write data to file in server.
                    BufferedOutputStream stream = new BufferedOutputStream(
                            new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                    //
                    uploadedFiles.add(serverFile);
                } catch (Exception e) {
                }
            }
        }
        model.addAttribute("uploadedFiles", uploadedFiles);
        return "uploadResult";
    }
    
	private static final String EXTERNAL_FILE_PATH="E:\\SSM\\upload\\pom.xml";
    @RequestMapping(value="/download/{type}", method = RequestMethod.GET)
	public void downloadFile(HttpServletResponse response, @PathVariable("type") String type) throws IOException {
	
		File file = null;
		
		file = new File(EXTERNAL_FILE_PATH);
		
		if(!file.exists()){
			String errorMessage = "Sorry. The file you are looking for does not exist";
			System.out.println(errorMessage);
			OutputStream outputStream = response.getOutputStream();
			outputStream.write(errorMessage.getBytes(Charset.forName("UTF-8")));
			outputStream.close();
			return;
		}
		
		String mimeType= URLConnection.guessContentTypeFromName(file.getName());
		if(mimeType==null){
			System.out.println("mimetype is not detectable, will take default");
			mimeType = "application/octet-stream";
		}
		
		System.out.println("mimetype : "+mimeType);
		
        response.setContentType(mimeType);
        
        /* "Content-Disposition : inline" will show viewable types [like images/text/pdf/anything viewable by browser] right on browser 
            while others(zip e.g) will be directly downloaded [may provide save as popup, based on your browser setting.]*/
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() +"\""));

        /* "Content-Disposition : attachment" will be directly download, may provide save as popup, based on your browser setting*/
        //response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
        
        response.setContentLength((int)file.length());

		InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

        //Copy bytes from source to destination(outputstream in this example), closes both streams.
        FileCopyUtils.copy(inputStream, response.getOutputStream());
	}
    
    @RequestMapping(value="/post")
    public String config(HttpServletRequest request, HttpServletResponse response) {
        return "editpost";
 
    }
    
    @RequestMapping(value="/UeditorPost",method=RequestMethod.POST)
    public void addNewPost(HttpServletRequest request, HttpServletResponse response) {
    	String ttl = request.getParameter("title");
    	String word_content = request.getParameter("editorValue");
    	byte[] cont = word_content.getBytes();
    	Cookie[] cookies = request.getCookies();
    	String userId;int uid;
    	for(Cookie c:cookies) {
    		if(c.getName().equals("userid")) {
    			userId = c.getValue();
    			uid = Integer.parseInt(userId);
    			postService.addNewPost(uid, null, cont, ttl);
    			try {
					request.getRequestDispatcher("showpost").forward(request, response);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    }
    
    @RequestMapping(value="/showpost")
    public ModelAndView showpost(HttpServletRequest request, HttpServletResponse response) {
    	ModelAndView model = new ModelAndView("showpost");
    	model.addObject("title",request.getParameter("title"));
    	model.addObject("content",request.getParameter("editorValue"));
		return model;
    }
    
    @RequestMapping(value="/showpost/bytitle/{id}")
    public String showpostByPid(@PathVariable String id,
    		Model model) {
    	Post post = postService.selectPostBypid(Integer.parseInt(id));
    	if(post == null) return "tectalk";
    	model.addAttribute("title",post.get_title());
    	Integer pid = post.get_pid();
    	model.addAttribute("pid",pid);
    	String cont = new String(post.get_content());
    	model.addAttribute("content",cont);
    	List<Reply> replys = post.getReplys();
    	int replyNum = replys.size();
    	model.addAttribute("replyNum",replyNum);
    	List<String> rt = new ArrayList<String>();
    	for(int i = 0;i < replyNum;i++) {
    		rt.add(new String(replys.get(i).get_content()));
    	}
    	model.addAttribute("replys",rt);
		return "showpost";
    }
    
    @RequestMapping(value="/UeditorReply")
    public void addReply(HttpServletRequest request,
    		HttpServletResponse response) {
    	String content = request.getParameter("content");
    	byte[] cont = content.getBytes();
    	String pid = request.getParameter("pid");
    	Integer pidValue = Integer.parseInt(pid);
    	Post post = postService.selectPostBypid(pidValue);
    	String title = request.getParameter("title");
    	Integer uid = post.get_userpid();
    	replyService.addNewReply(uid, pidValue, cont);
    	try {
			request.getRequestDispatcher("showpost/bytitle/"+pid).forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}  