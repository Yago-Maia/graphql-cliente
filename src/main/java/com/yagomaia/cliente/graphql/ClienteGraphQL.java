package com.yagomaia.cliente.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.yagomaia.cliente.entity.Cliente;
import com.yagomaia.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ClienteService service;

    public Cliente cliente(Long id) {
        return service.findById(id);
    }

    public List<Cliente> clientes() {
        return service.findAll();
    }

    public Cliente saveCliente(Cliente cliente) {
        return service.save(cliente);
    }

    public Boolean deleteCliente(Long id) {
        return service.deleteById(id);
    }

}
