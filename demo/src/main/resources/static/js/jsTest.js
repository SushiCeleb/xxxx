/**
 *
 */
			$(document).ready(function() {
				  //tr要素をクリックでイベント発火
				      $('table tr').click(function() {
				        //td要素からチェックボックスを探す
				             var $c = $(this).children('td').children('input[type=checkbox]');
				            if($c.prop('checked'))
				           $c.prop('checked', '');
				        else
				           $c.prop('checked', 'checked');
				      });
				});

			$(document).ready(function() {
				  //tr要素をクリックでイベント発火
				      $('table tr').click(function() {
				    	  alert("evrnt1");
				        //td要素からチェックボックスを探す
				             var $c = $(this).children('td').children('input[type=radio]');
				            if($c.prop('checked'))
				           $c.prop('checked', '');
				        else
				           $c.prop('checked', 'checked');
				      });
				});



