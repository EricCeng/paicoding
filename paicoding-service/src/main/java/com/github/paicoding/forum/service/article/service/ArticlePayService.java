package com.github.paicoding.forum.service.article.service;

import com.github.paicoding.forum.api.model.vo.article.dto.ArticlePayInfoDTO;

/**
 * @author YiHui
 * @date 2024/10/29
 */
public interface ArticlePayService {

    /**
     * 用户是否已经支付过了
     *
     * @param article
     * @param currentUerId
     * @return
     */
    boolean hasPayed(Long article, Long currentUerId);

    /**
     * 唤起支付
     *
     * @param articleId     文章
     * @param currentUserId 当前用户
     */
    ArticlePayInfoDTO toPay(Long articleId, Long currentUserId);

    /**
     * 更新为支付中，由用户告诉后端，表明自己已经支付成功了
     *
     * @param payId         支付id
     * @param currentUserId 当前登录用户
     * @return true 表示更新成功
     */
    boolean updatePaying(Long payId, Long currentUserId);

    /**
     * 支付状态更新
     *
     * @param payId     支付id
     * @param payStatus 支付状态
     * @return
     */
    boolean updatePayStatus(Long payId, Integer payStatus);
}
