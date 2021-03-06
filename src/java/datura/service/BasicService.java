package datura.service;

import datura.entity.PageOfRecords;
import datura.dao.IBasicDao;
import datura.service.IBasicService;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Author : JiaLin
 * @Group : TGB
 * @Date : 2014/5/21
 * @Description :
 */
public abstract class BasicService<M extends java.io.Serializable, PK extends java.io.Serializable> implements IBasicService<M, PK> {

    // @Resource
    protected IBasicDao<M, PK> baseDao;

    public BasicService(IBasicDao<M, PK> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public M save(M model) {
        baseDao.save(model);
        return model;
    }

    @Override
    public void saveOrUpdate(M model) {
        baseDao.saveOrUpdate(model);
    }

    @Override
    public void update(M model) {
        baseDao.update(model);
    }

    @Override
    public void merge(M model) {
        baseDao.merge(model);
    }

    @Override
    public void delete(PK id) {
        baseDao.delete(id);
    }

    @Override
    public void deleteObject(M model) {
        baseDao.deleteObject(model);
    }

    @Override
    public void deleteArray(PK[] id) {
        baseDao.deleteArray(id);
    }

    @Override
    public boolean exists(PK id) {
        return baseDao.exists(id);
    }

    @Override
    public M get(PK id) {
        return baseDao.get(id);
    }

    @Override
    public M get(LinkedHashMap<Object, Object> equalFields, LinkedHashMap<Object, Object> notEqualFields, LinkedHashMap<String, String> LikeFields, LinkedHashMap<String, String> nullFields, String whereJpql) {
        return baseDao.get(equalFields, notEqualFields, LikeFields, nullFields, whereJpql);
    }
    
    
    @Override
    public M get(LinkedHashMap<Object, Object> equalFields) {
        return baseDao.get(equalFields);
    }


    @Override
    public Long getTotalCount(LinkedHashMap<Object, Object> equalFields, LinkedHashMap<Object, Object> notEqualFields, LinkedHashMap<String, String> LikeFields, LinkedHashMap<String, String> nullFields, String whereJpql) {
        return baseDao.getTotalCount(equalFields, notEqualFields, LikeFields, nullFields, whereJpql);
    }

    @Override
    public List<M> findResultList(LinkedHashMap<Object, Object> equalFields, LinkedHashMap<Object, Object> notEqualFields, LinkedHashMap<String, String> LikeFields, LinkedHashMap<String, String> nullFields, LinkedHashMap<String, String> orderByFields, String whereJpql, int firstResult, int maxResult) {
        return findResultList(equalFields, notEqualFields, LikeFields, nullFields, orderByFields, whereJpql, firstResult, maxResult);
    }

    @Override
    public PageOfRecords<M> queryPageModel(LinkedHashMap<Object, Object> equalFields, LinkedHashMap<Object, Object> notEqualFields, LinkedHashMap<String, String> LikeFields, LinkedHashMap<String, String> nullFields, LinkedHashMap<String, String> orderByFields, String whereJpql, PageOfRecords<M> pageModel) {
        return baseDao.queryPageModel(equalFields, notEqualFields, LikeFields, nullFields, orderByFields, whereJpql, pageModel);
    }

    @Override
    public PageOfRecords<M> queryPageModelByEqual(LinkedHashMap<Object, Object> equalFields, PageOfRecords<M> pageModel, LinkedHashMap<String, String> orderByFields) {
        return baseDao.queryPageModel(equalFields, null, null, null,
                orderByFields, null, pageModel);
    }

    @Override
    public PageOfRecords<M> queryPageModelByLike(LinkedHashMap<String, String> likeFields, PageOfRecords<M> pageModel, LinkedHashMap<String, String> orderByFields) {
        return baseDao.queryPageModel(null, null, likeFields, null,
                orderByFields, null, pageModel);
    }

    @Override
    public PageOfRecords<M> queryPageModelByLikeAndEqual(LinkedHashMap<Object, Object> equalFields, LinkedHashMap<String, String> likeFields, LinkedHashMap<String, String> orderByFields, PageOfRecords<M> pageModel) {
        return baseDao.queryPageModel(equalFields, null, likeFields, null,
                orderByFields, null, pageModel);
    }
}
