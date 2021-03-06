package datura.service;

import datura.entity.PageOfRecords;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by JiaLin on 2014/5/23.
 */
public interface IBasicService<M extends java.io.Serializable, PK extends java.io.Serializable> {

    //基本CRUD

    public M save(M model);

    public void saveOrUpdate(M model);

    public void update(M model);

    public void merge(M model);

    public void delete(PK id);

    public void deleteObject(M model);

    public void deleteArray(PK id[]);

    public boolean exists(PK id);

    public M get(PK id);

    public M get(LinkedHashMap<Object, Object> equalFields);

    public M get(LinkedHashMap<Object, Object> equalFields,
            LinkedHashMap<Object, Object> notEqualFields,
            LinkedHashMap<String, String> LikeFields,
            LinkedHashMap<String, String> nullFields, String whereJpql);

    // =============获取List================
    public Long getTotalCount(
            LinkedHashMap<Object, Object> equalFields,
            LinkedHashMap<Object, Object> notEqualFields,
            LinkedHashMap<String, String> LikeFields,
            LinkedHashMap<String, String> nullFields, String whereJpql);

    public List<M> findResultList(
            LinkedHashMap<Object, Object> equalFields,
            LinkedHashMap<Object, Object> notEqualFields,
            LinkedHashMap<String, String> LikeFields,
            LinkedHashMap<String, String> nullFields,
            LinkedHashMap<String, String> orderByFields, String whereJpql,
            int firstResult, int maxResult);

    //=============获取pageModel================
    public PageOfRecords<M> queryPageModel(
            LinkedHashMap<Object, Object> equalFields,
            LinkedHashMap<Object, Object> notEqualFields,
            LinkedHashMap<String, String> LikeFields,
            LinkedHashMap<String, String> nullFields,
            LinkedHashMap<String, String> orderByFields, String whereJpql,
            PageOfRecords<M> pageModel);

    public PageOfRecords<M> queryPageModelByEqual(
            LinkedHashMap<Object, Object> equalFields, PageOfRecords<M> pageModel,
            LinkedHashMap<String, String> orderByFields);

    public PageOfRecords<M> queryPageModelByLike(
            LinkedHashMap<String, String> likeFields, PageOfRecords<M> pageModel,
            LinkedHashMap<String, String> orderByFields);

    public PageOfRecords<M> queryPageModelByLikeAndEqual(
            LinkedHashMap<Object, Object> equalFields,
            LinkedHashMap<String, String> likeFields,
            LinkedHashMap<String, String> orderByFields, PageOfRecords<M> pageModel);

}
