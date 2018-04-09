package com.hk.notBeFooled.repository;

import com.hk.notBeFooled.model.Referee;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface RefereeRepository  extends CrudRepository <Referee,Integer>{

    //List<Referee> findByName (String name);

}
