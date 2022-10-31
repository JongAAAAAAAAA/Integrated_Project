package com.example.IntegratedProject.service;

import com.example.IntegratedProject.dao.RxBatteryRepository;
import com.example.IntegratedProject.dao.SensingRepository;
import com.example.IntegratedProject.dao.TxBatteryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchedulerService {
    private final RxBatteryRepository rxBatteryRepository;
    private final TxBatteryRepository txBatteryRepository;
    private final SensingRepository sensingRepository;
}
