package com.hk.notBeFooled.repository;

import com.hk.notBeFooled.model.Referee;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface RefereeRepository  extends CrudRepository <Referee,Long>{

    //List<Referee> findByName (String name);

}
