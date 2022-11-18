package com.calzamundoshoes.calzamundo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.calzamundoshoes.calzamundo.Repository.IUserRepository;
import com.calzamundoshoes.calzamundo.entity.Authority;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    IUserRepository iUserRepository;
    
   
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
    //Buscar el usuario con el repositorio y si no existe lanzar una exepcion
    com.calzamundoshoes.calzamundo.entity.User appUser = iUserRepository.findByNameUser(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
       
    //Mapear nuestra lista de Authority con la de spring security 
    List grantList = new ArrayList();
    for (Authority authority: appUser.getAuthority()) {
        // ROLE_USER, ROLE_ADMIN,..
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
   }
       
    //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
    UserDetails user = (UserDetails) new User(appUser.getNameUser(), appUser.getPasswordEmployee(), grantList);
            return user;
   }

}
