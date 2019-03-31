package br.com.henrique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.domain.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
