package com.example.controllers;
import com.example.models.UserTable;
import com.example.services.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    @Get
    public HttpResponse<List<UserTable>> getAllUsers() {
        return HttpResponse.ok(userService.getAllUsers());
    }

    @Get("/{id}")
    public HttpResponse<UserTable> getUser(@PathVariable Long id) {
        return HttpResponse.ok(userService.getUser(id));
    }
    @Post
    public HttpResponse<UserTable> createUser(@Body  UserTable userTable) {
        return HttpResponse.created(userService.createUser(userTable));
    }

    @Put("/{id}")
    public HttpResponse<UserTable> updateUser(@PathVariable Long id, @Body UserTable user) {
        return HttpResponse.ok(userService.updateUser(id, user));
    }

    @Delete("/{id}")
    public HttpResponse deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return HttpResponse.ok();
    }


}