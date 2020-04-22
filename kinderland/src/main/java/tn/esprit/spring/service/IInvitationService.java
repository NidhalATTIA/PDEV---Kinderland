package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Invitation;

public interface IInvitationService {
	public Invitation AddInvitation(Invitation invitation);

	public List<Invitation> GetAllInvitationJPQL();

	public Invitation GetInvitationById(Long InvitationId);

	public Invitation UpdateInvitation(Invitation Invitation);

	public void DeleteInvitation(Long InvitationId);
}
