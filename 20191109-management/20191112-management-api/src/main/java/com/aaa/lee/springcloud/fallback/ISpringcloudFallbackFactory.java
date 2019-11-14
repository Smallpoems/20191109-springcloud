package com.aaa.lee.springcloud.fallback;

import com.aaa.lee.springcloud.model.Book;
import com.aaa.lee.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringcloudService> {

    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<Book> selectAllBooks() {
                System.out.println("测试熔断的方法打印");
                return null;
            }
        };
    }

}
