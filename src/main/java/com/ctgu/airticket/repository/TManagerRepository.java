package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TManager;
import com.ctgu.airticket.entity.TOrderdetail;
import com.ctgu.airticket.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 *
 * @author xzh
 * @since 2020-12-18 18:50
 */
public interface TManagerRepository extends JpaRepository<TManager,Integer> {
    public TManager findByUsernameAndPassword(String username, String password);
}
