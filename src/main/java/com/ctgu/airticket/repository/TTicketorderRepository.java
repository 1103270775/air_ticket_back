package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TTicketorder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 *
 * @author xzh
 * @since 2020-12-18 18:50
 */
public interface TTicketorderRepository extends JpaRepository<TTicketorder,Integer> {
    public List<TTicketorder> findAllByUid(int uid);
}
