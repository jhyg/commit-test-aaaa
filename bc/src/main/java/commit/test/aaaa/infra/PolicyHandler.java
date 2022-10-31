package commit.test.aaaa.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import commit.test.aaaa.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import commit.test.aaaa.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired ARepository aRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

}


