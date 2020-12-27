package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 *
 * @author xzh 111
 * @since 2020-12-18 18:50
 */
public interface TUserRepository extends JpaRepository<TUser,Integer> {
    public TUser findByUsernameAndPassword(String username,String password);
}
