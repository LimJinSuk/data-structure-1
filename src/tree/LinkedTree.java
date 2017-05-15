package tree;

import list.List;

public class LinkedTree<E> {
	private TreeNode<E> root;
	
	public LinkedTree( E data ) {
		root = new TreeNode<E>( data );
	}
	
	public TreeNode<E> getRoot() {
		return root;
	}
	
	public TreeNode<E> insertLeft( TreeNode<E> parent, E data) {
		final TreeNode<E> node = new TreeNode<E>( data );
		parent.left = node;
		return node;
	}

	public TreeNode<E> insertRight( TreeNode<E> parent, E data) {
		final TreeNode<E> node = new TreeNode<E>( data );
		parent.right = node;
		return node;
	}

	public void traversalPostorder( List<E> list ){
		traversalPostorder( root, list );
	}

	public void traversalPreorder( List<E> list ){
		traversalPreorder( root, list );
	}
	
	public void traversalInorder( List<E> list ){
		traversalInorder( root, list );
	}
	
	public void traversalPostorder( TreeNode<E> node, List<E> list ){
		if( node.left != null ) {
			traversalPostorder( node.left, list );
		}
		
		if( node.right != null ) {
			traversalPostorder( node.right, list );
		}
		
		list.add( node.data );
	}

	public void traversalPreorder( TreeNode<E> node, List<E> list ){
		list.add( node.data );

		if( node.left != null ) {
			traversalPreorder( node.left, list );
		}
		
		if( node.right != null ) {
			traversalPreorder( node.right, list );
		}
	}
	
	public void traversalInorder( TreeNode<E> node, List<E> list ){
		if( node.left != null ) {
			traversalInorder( node.left, list );
		}

		list.add( node.data );
		
		if( node.right != null ) {
			traversalInorder( node.right, list );
		}
	}	
	
	public static class TreeNode<E>{
		private E data;
		private TreeNode<E> left;
		private TreeNode<E> right;
		
		public TreeNode( E data ) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}
