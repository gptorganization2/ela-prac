package com.highfive.ela_prac.service;

import com.highfive.ela_prac.dto.MenuDTO;
import com.highfive.ela_prac.entity.Menu;
import com.highfive.ela_prac.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper mapper;

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper mapper) {
        this.menuRepository = menuRepository;
        this.mapper = mapper;
    }

    public MenuDTO findByMenuCode(int menuCode) {

        Menu menu = menuRepository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        return mapper.map(menu, MenuDTO.class);
    }
}
