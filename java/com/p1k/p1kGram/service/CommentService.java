package com.p1k.p1kGram.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p1k.p1kGram.domain.comment.Comment;
import com.p1k.p1kGram.domain.comment.CommentRepository;
import com.p1k.p1kGram.domain.image.Image;
import com.p1k.p1kGram.domain.user.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CommentService {
	
	private final CommentRepository commentRepository;

	@Transactional
	public Comment 댓글쓰기(User principal,String content, int imageId) {
		
		Image image = Image.builder()
				.id(imageId)
				.build();
		
		// Save할 때 연관관계가 있으면 오브젝트로 만들어서 id값만 넣어주면 된다.
		Comment comment = Comment.builder()
				.content(content)
				.image(image)
				.user(principal)
				.build();
		
		return commentRepository.save(comment);
	}
	
	@Transactional
	public void 댓글삭제(int id, int principalId) {
		
		Comment commentEntity = commentRepository.findById(id).get();
		
		if (commentEntity.getUser().getId() == principalId) {
			commentRepository.deleteById(id);
		} else { }}}