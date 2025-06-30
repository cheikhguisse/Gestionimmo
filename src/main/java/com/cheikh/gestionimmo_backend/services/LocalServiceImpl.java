package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Local;
import com.cheikh.gestionimmo_backend.entities.Locataire;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService {
   @Override
    public Local saveLocal(Local l) {
        return null;
    }

    @Override
    public Local updateLocal(Local l) {
        return null;
    }

    @Override
    public void deleteLocal(Local l) {

    }

    @Override
    public void deleteLocalByIdLocal(Long idLocal) {

    }

    @Override
    public void deleteLocalById(Long idLocal) {

    }

    @Override
    public Local getLocal(Long idLocal) {
        return null;
    }

    @Override
    public List<Local> getAllLocal() {
        return List.of();
    }

    @Override
    public List<Local> findByDescriptionLocal(String description) {
        return List.of();
    }

    @Override
    public List<Local> findByDescriptionLocalSurface(String Description) {
        return List.of();
    }

    @Override
    public List<Local> findByDescriptionPrix(String Description, Double prix) {
        return List.of();
    }

    @Override
    public List<Local> findByLocataire(Locataire locataire) {
        return List.of();
    }

    @Override
    public List<Local> findByLocataireCni(Long cni) {
        return List.of();
    }

    @Override
    public List<Local> findByOrderByDescriptionLocalAsc() {
        return List.of();
    }

    @Override
    public List<Local> trierLocalDescriptionPrix() {
        return List.of();
    }

    @Override
    public List<Local> findByTypeLocal(String typeLocal) {
        return List.of();
    }

  /*  @Autowired
    LocalRepository localRepository ;

    @Override
    public Local saveLocal(Local l) {
        return localRepository.save(l);
    }
    @Override
    public Local updateLocal(Local l) {
        return localRepository.save(l);

    }

    @Override
    public void deleteLocal(Local l) {
        localRepository.delete(l);

    }

    @Override
    public void deleteLocalByIdLocal(Long idLocal) {
        localRepository.deleteById(idLocal);

    }

    @Override
    public void deleteLocalById(Long idLocal) {

    }

    @Override
    public Local getLocal(Long idLocal) {
        return localRepository.findById(idLocal).get();
    }

    @Override
    public List<Local> getAllLocal() {
        return localRepository.findAll();
    }

    @Override
    public List<Local> findByDescriptionLocal(String description) {
        return List.of();
    }

    @Override
    public List<Local> findByDescriptionLocalSurface(String Description) {
        return List.of();
    }

    @Override
    public List<Local> findByDescriptionPrix(String Description, Double prix) {
        return List.of();
    }

    @Override
    public List<Local> findByLocataire(Locataire locataire) {
        return List.of();
    }

    @Override
    public List<Local> findByLocataireCni(Long cni) {
        return List.of();
    }

    @Override
    public List<Local> findByOrderByDescriptionLocalAsc() {
        return List.of();
    }

    @Override
    public List<Local> trierLocalDescriptionPrix() {
        return List.of();
    }
*/
}
