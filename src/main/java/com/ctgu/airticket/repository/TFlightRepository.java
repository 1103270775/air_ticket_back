package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TFlight;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.repository
 * @Date:2020/12/18
 * @Description:
 * @Version 1.0
 */

public interface TFlightRepository extends JpaRepository<TFlight,Integer> {
    public List<TFlight> findByFromcityAndTocityAndFromtimeBetween(String fromcity, String tocity, Date fromtime, Date latstime);
    public List<TFlight> findTFlightsByFromtimeAfter(Date date);
}
