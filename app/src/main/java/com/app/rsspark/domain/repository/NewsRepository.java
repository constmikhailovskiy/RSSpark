package com.app.rsspark.domain.repository;

import com.app.rsspark.domain.models.NewsItem;

import java.util.Date;

import rx.Observable;

/**
 * @author kmykhaylovskyy
 * Only News-entity specific CRUD- and filtering operations are declared here
 */

public interface NewsRepository {
    Observable<NewsItem> newNewsItem(String title, String description, String link, String imageUrl, Date date);
}