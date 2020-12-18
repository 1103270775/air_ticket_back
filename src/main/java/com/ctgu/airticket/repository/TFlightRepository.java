package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TFlight;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.repository
 * @Date:2020/12/18
 * @Description:
 * @Version 1.0
 */
public interface TFlightRepository extends JpaRepository<TFlight,Integer> {
}
