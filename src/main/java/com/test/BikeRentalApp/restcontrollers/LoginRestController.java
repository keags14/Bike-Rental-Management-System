package com.test.BikeRentalApp.restcontrollers;

import com.test.BikeRentalApp.beans.Login;
import com.test.BikeRentalApp.beans.User;
import com.test.BikeRentalApp.exceptions.LoginFailureException;
import com.test.BikeRentalApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/BikeRentalApp/rest/loginuser")
    public ResponseEntity loginUser(@RequestBody Login login) throws LoginFailureException {
        System.out.println(login.getUsername()+" "+login.getPassword());
        User user = userRepository.searchByName(login.getUsername());

        if(user==null){
          // return ResponseEntity.status(404).build();
            return new ResponseEntity<>("User not found",HttpStatus.NOT_FOUND);
        }

        if(user.getUsername().equals(login.getUsername())&&
            user.getPassword().equals(login.getPassword()))  {
            return new ResponseEntity<>("Welcome, "+user.getUsername(),HttpStatus.OK);
        }
        else{
            //throw new Exception
            throw new LoginFailureException("Invalid username or password");
        }

    }
}
