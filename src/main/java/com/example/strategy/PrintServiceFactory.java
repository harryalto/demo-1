package com.example.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintServiceFactory {
	
	public static final String defaultPrintStrategy = "DefaultPrintStrategy";

    @Autowired
    private List<IPrintStrategy> services;

    private static final Map<String, IPrintStrategy> myPrintServiceCache = new HashMap<>();

    @PostConstruct
    public void initMyServiceCache() {
        for(IPrintStrategy service : services) {
        	myPrintServiceCache.put(service.getType(), service);
        }
    }

    public static IPrintStrategy getService(String type) {
    	IPrintStrategy service = myPrintServiceCache.get(type);
        if(service == null) {
        	service = myPrintServiceCache.get(defaultPrintStrategy);
        	System.out.println(" Sending Default Print Strategy");
        }
        return service;
    }
}