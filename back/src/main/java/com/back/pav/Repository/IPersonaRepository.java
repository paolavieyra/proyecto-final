
package com.back.pav.Repository;

import com.back.pav.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
