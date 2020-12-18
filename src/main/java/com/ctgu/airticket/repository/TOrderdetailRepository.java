package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TOrderdetail;
import com.ctgu.airticket.entity.TTicketorder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TOrderdetailRepository extends JpaRepository<TOrderdetail,Integer> {
}
