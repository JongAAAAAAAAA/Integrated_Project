package com.example.IntegratedProject.service;

import com.example.IntegratedProject.dao.RxBatteryRepository;
import com.example.IntegratedProject.dao.SensingRepository;
import com.example.IntegratedProject.dao.TxBatteryRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SchedulerService {
    private final RxBatteryRepository rxBatteryRepository;
    private final TxBatteryRepository txBatteryRepository;
    private final SensingRepository sensingRepository;

//    @Scheduled(fixedDelay = 11111111)
//    public void DBController(){
//
//
//        System.out.println("Hello World!");
//    }
}
