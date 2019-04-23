package springboot2.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }

    //管理后台的servlet
    @Bean
    public ServletRegistrationBean staVimServlet(){
        //第二个参数管理哪个servlet的下的请求
        ServletRegistrationBean srb = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //还能配置一些相关信息 在staviewservlet的父类ResourceServlet里观看
        return srb;
    }
    //监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean frb = new FilterRegistrationBean();
        Map<String,String> init = new HashMap<>();
        //拦截静态资源或者某些权限请求
        init.put("exclusions",".html,.css,/druid/*");
        frb.setUrlPatterns(Arrays.asList("/*"));
        frb.setFilter(new WebStatFilter());
        frb.setInitParameters(init);
        return frb;
    }

}
