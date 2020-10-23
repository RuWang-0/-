package impl;

import base.BaseServiceImpl;
import dao.LabelDao;
import entity.Label;
import org.springframework.stereotype.Service;
import service.LabelService;

import java.util.List;

@Service
public class LabelServiceImpl extends BaseServiceImpl<LabelDao, Label> implements LabelService {
    public Label findOne(int key) {
        return null;
    }

    public Label save(Label entity) {
        return null;
    }

    public void delete(Object key) {

    }

    public List<Label> findAll() {
        return null;
    }

    public void deleteInBatch(Iterable<Label> iterable) {

    }

    public List<Label> findAll(Iterable<Integer> iterable) {
        return null;
    }

    public List<Label> save(Iterable<Label> iterable) {
        return null;
    }
}
