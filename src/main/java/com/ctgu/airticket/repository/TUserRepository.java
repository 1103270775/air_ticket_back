package com.ctgu.airticket.repository;

import com.ctgu.airticket.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.net.www.protocol.http.HttpURLConnection;

public interface TUserRepository extends JpaRepository<TUser,Integer> {
    public TUser findByUsernameAndPassword(String username,String password);
}
