package com.manager.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.manager.demo1.modal.Register;


public interface Registerrepository  extends JpaRepository <Register, Long >   {

}
