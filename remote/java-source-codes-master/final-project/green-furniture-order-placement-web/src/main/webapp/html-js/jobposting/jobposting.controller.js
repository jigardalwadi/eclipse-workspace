(function() {
    'use strict';

    angular
        .module('greenFurniture')
        .controller('JobPostingController', JobPostingController);

    JobPostingController.$inject = ['ParseLinks', 'AlertService', '$state', 'Author'];

    function JobPostingController(ParseLinks, AlertService, $state,  JobPosting ) {
        var vm = this;

        vm.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
        vm.loadAll = loadAll;
        vm. jobPostings = [];
        vm.clear = clear;
        vm.links = null;

        vm.loadAll();
        
        function loadAll () {
			JobPosting.query({},onSuccess, onError);
        }

        function onSuccess(data, headers) {
			 vm.jobPostings = data;
        }

        function onError(error) {
			  AlertService.error(error.data.message);
        }

        function clear () {
            vm.posting = {
                id: null, firstName: null, lastName: null, nationality: null
            };
        }
    }
})();
