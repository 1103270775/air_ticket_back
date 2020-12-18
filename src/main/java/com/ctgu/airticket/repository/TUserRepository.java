package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.net.www.protocol.http.HttpURLConnection;
/**
 * (TUser)实体类
 *
 * @author 11032
 * @since 2020-12-18 14:41:09
 */
public interface TUserRepository extends JpaRepository<TUser,Integer> {
    public TUser findByUsernameAndPassword(String username,String password);
}
