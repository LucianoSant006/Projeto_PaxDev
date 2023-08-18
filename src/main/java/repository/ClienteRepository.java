package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import identity.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
