package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.repository.BlogRepository;
import tn.esprit.spring.repository.KindergardenRepository;
import tn.esprit.spring.repository.RechRepository;

@Service
public class RechServiceImpl implements RechService {

	@Autowired
	RechRepository adRepository;

	public static final Logger l = LogManager.getLogger(RechServiceImpl.class);

	@Override
    public List<Kindergarden> FiltreMulticritèreV(String adress, String title, float cost) {
        // TODO Auto-generated method stub

        List<Kindergarden> searchedAds= new ArrayList<>();
        searchedAds.addAll(adRepository.findAdByCriteriaV(adress, title, cost));


        l.info("AAAAAAAAAAAAAAAAAAAAAA++++++++++"+searchedAds);
        l.info("AAAAAAAAAAAAAAAAAAAAAA++++++++++"+searchedAds.size());
        return searchedAds;
    }
	

}
