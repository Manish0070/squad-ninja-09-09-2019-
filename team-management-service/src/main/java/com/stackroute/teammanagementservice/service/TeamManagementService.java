package com.stackroute.teammanagementservice.service;

import com.stackroute.teammanagementservice.domain.Idea;
import com.stackroute.teammanagementservice.exception.IdeaTitleAlreadyExistException;

public interface TeamManagementService {
    public Idea saveIdea(Idea idea) throws IdeaTitleAlreadyExistException;
    public Idea  updateSelectedTeam(Idea idea);
    public Idea updateAppliedTeam(Idea idea);
    public Idea updateInvitedTeam(Idea idea);
   public  Idea acceptedsp(String tite,String emailId,boolean accepted);
   public Idea joinsp(String title, String emailId, boolean joined);
}
