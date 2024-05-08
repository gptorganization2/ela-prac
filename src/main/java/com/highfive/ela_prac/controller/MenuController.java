package com.highfive.ela_prac.controller;

import com.highfive.ela_prac.dto.MenuDTO;
import com.highfive.ela_prac.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("health")
    public String healthCheck() {
        return "fine!";
    }

    @GetMapping("menus/{menuCode}")
    public MenuDTO findByMenuCode(@PathVariable("menuCode") int menuCode) {

        MenuDTO menu = menuService.findByMenuCode(menuCode);

        return menu;
    }
}
