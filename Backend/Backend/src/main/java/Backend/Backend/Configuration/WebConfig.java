package Backend.Backend.Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Configure the URL pattern to allow CORS for
                .allowedOrigins("http://localhost:3000","https://sign-up-login-frontend-kishans-projects-53423b62.vercel.app/") // Add your React frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow specific methods
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
