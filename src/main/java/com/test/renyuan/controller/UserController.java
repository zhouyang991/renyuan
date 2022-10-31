package com.test.renyuan.controller;

import com.test.renyuan.entity.User;
import com.test.renyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/index")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/",method = RequestMethod.GET)
public List<User> findAll(){
    return userService.findAll();
}
    @RequestMapping(value="/all",method = RequestMethod.GET)
    public List<User> find(){
        return userService.find();
    }
    @RequestMapping(value="/",method= RequestMethod.POST)
    public void insert(@RequestBody User user){ userService.insert(user);}
    @RequestMapping(value="/{userid}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("userid") Integer userid){
        userService.delete(userid);
    }
    @RequestMapping(value="/edit",method=RequestMethod.POST)
    public void edit(@RequestBody User user){userService.edit(user);
    }
  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public String loginIn(@RequestBody User user){

      User user1=new User();
      user1.setName(user.getName());
      user1.setPassword(user.getPassword());
      if(userService.selectOneUser(user1)==null){
          return "无此账号";
      }
      return "登录成功";
  }

}
