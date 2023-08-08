package com.dh.series.service;

import com.dh.series.exceptions.ApiException;
import com.dh.series.model.Serie;
import com.dh.series.model.dto.SerieDTO;

import java.util.List;
import java.util.Optional;

public interface SerieService {

    Serie save(SerieDTO seriedto) throws ApiException;

    List<Serie> getAll();

    Optional<Serie> getById(String id);

    String deleteById(String id);

    Serie updateById(Serie serie);

}
