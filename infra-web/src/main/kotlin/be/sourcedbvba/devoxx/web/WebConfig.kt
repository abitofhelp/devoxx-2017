package be.sourcedbvba.devoxx.web

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
class WebConfig {
    @Bean
    fun autoJsonRpcExporter() = AutoJsonRpcServiceImplExporter()
}
