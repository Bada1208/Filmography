package com.sysoiev.controller;

import com.sysoiev.model.Film;
import com.sysoiev.service.FilmService;
import com.sysoiev.service.FilmServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FilmController {
    private FilmService filmService = new FilmServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allFilms() {
        List<Film> films = filmService.allFilms();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("filmsList", films);
        return modelAndView;


    }
}
