package fr.sogilis.blog.article;

import java.util.Collection;

public class SRP {

    private class Article {
        private double price;

        public double getPrice() {
            return price;
        }
    }

    public int compareArticlePriceToAverage(Article article, Collection<Article> allArticles) {
        return compare(article.getPrice(), computePriceAverage(allArticles));
    }

    public double computePriceAverage(Collection<Article> articles) {
        return divide(sumPrices(articles), count(articles));
    }

    public double sumPrices(Collection<Article> articles) {
        return articles.stream()
                .mapToDouble(Article::getPrice)
                .average()
                .getAsDouble();
    }

    public int count(Collection<Article> articles) {
        return articles.size();
    }

    public double divide(double numerator, double denominator) {
        return numerator / denominator;
    }

    public int compare(double amount1, double amount2) {
        return Double.valueOf(amount1).compareTo(amount2);
    }
}


