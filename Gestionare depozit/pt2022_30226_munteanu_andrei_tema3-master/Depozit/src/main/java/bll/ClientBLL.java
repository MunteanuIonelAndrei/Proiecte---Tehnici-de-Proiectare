package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import bll.validators.EmailValidator;
import bll.validators.ClientAgeValidator;
import bll.validators.Validator;
import dao.ClientDAO;
import model.Client;
import presentation.UpdateAux;

/**
 * @Author: Technical University of Cluj-Napoca, Romania Distributed Systems
 *          Research Laboratory, http://dsrl.coned.utcluj.ro/
 * @Since: Apr 03, 2017
 */
public class ClientBLL {

    private List<Validator<Client>> validators;
    private ClientDAO clientDAO;

    public ClientBLL() {
        validators = new ArrayList<Validator<Client>>();
        validators.add(new EmailValidator());
        validators.add(new ClientAgeValidator());

        clientDAO = new ClientDAO();
    }

    public Client findClientById(int id) {
        Client cl = clientDAO.findById(id);
        if (cl == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");
        }
        return cl;
    }
    public void deleteById(int id) {


      clientDAO.deleteById(id);

    }

    public List<Client> findAll() {
        List<Client> cl = clientDAO.findAll();
        if (cl == null) {
            throw new NoSuchElementException("The table was not found!");
        }
        return cl;
    }

    public void insert(Client x) throws IllegalAccessException {
       for (Validator<Client> c : validators) {
            c.validate(x);
        }
        Client cl = clientDAO.insert(x);
    }

    public void update(Client x, UpdateAux updateAux) throws IllegalAccessException, NoSuchFieldException {
        for (Validator<Client> c : validators) {
            c.validate(x);
        }
        clientDAO.update(x,updateAux);
    }


}
