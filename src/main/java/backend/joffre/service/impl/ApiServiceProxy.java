package backend.joffre.service.impl;

import org.springframework.cloud.openfeign.FeignClient;

import backend.joffre.service.ApiService;


@FeignClient(name = "api-service")
public interface ApiServiceProxy extends ApiService{

}
