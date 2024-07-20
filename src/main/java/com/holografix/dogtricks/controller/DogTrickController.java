package com.holografix.dogtricks.controller;

import com.holografix.dogtricks.model.DogTrick;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
class DogTrickController {

    @QueryMapping
    public DogTrick trickById(@Argument int id) {
        return DogTrick.getById(id);
    }

    @QueryMapping
    public List<DogTrick> dogTricks() {
        return DogTrick.getAllTricks();
    }

}