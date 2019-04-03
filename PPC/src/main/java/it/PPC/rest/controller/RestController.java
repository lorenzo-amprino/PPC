package it.PPC.rest.controller;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.PPC.model.CreatePuzzleRequest;
import it.PPC.model.CreatePuzzleResponse;
import it.PPC.model.RetriveWordListResponse;
import it.PPC.puzzle.Puzzle;
import it.PPC.util.leggiFile.FileManagerUtil;


@Controller
public class RestController {

	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
	  
	@RequestMapping(value = "/createPuzzle", method = RequestMethod.POST)
	public @ResponseBody CreatePuzzleResponse createPuzzle(@RequestBody String jsonStr){
		
		ObjectMapper mapper = new ObjectMapper();
		CreatePuzzleRequest request=null;
		try {
			request = mapper.readValue(jsonStr, CreatePuzzleRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Puzzle puzzle = new Puzzle(request.getRow(), request.getCol());
		
        CreatePuzzleResponse response = new CreatePuzzleResponse();
        response.setPuzzle(puzzle);
        return response;
    }
	
	@RequestMapping(value = "/retriveWordList", method = RequestMethod.GET)
	public @ResponseBody RetriveWordListResponse retriveWordList() {
		
		Puzzle puzzle = new Puzzle(5, 5);
		FileManagerUtil fm = new FileManagerUtil("D:\\PPC", puzzle);

		try {
			fm.createSchemaFile(puzzle);
			fm.readWords("D:\\PPC\\altre.txt", puzzle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RetriveWordListResponse response = new RetriveWordListResponse();
		response.setWordList(puzzle.getListaParole());
		return response;
	}
	 
}