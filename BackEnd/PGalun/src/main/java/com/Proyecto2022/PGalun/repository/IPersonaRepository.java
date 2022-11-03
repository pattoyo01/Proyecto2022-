
package com.Proyecto2022.PGalun.repository;

import com.Proyecto2022.PGalun.Entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
