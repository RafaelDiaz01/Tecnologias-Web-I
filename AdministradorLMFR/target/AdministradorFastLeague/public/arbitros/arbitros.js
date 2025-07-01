document.addEventListener('DOMContentLoaded', function () {

    // Elementos del DOM
    const modalBackdrop = document.getElementById('modalBackdrop');
    const formModal = document.getElementById('formModal');
    const toggleFormBtn = document.getElementById('toggleFormBtn');
    const closeModalBtn = document.querySelector('.close-modal');
    const form = document.querySelector('#formModal form');

    // Función para abrir el modal en modo creación
    function openCreateForm() {
        // Resetear el formulario
        form.reset();
        // Cambiar el título del modal
        document.querySelector('.form-header h2').textContent = 'Registrar Nuevo Árbitro';
        // Cambiar el texto del botón submit
        document.querySelector('.btn-submit').textContent = 'Registrar Árbitro';
        // Resetear el campo hidden id
        document.querySelector('input[name="id"]').value = '';
        // Mostrar el modal
        showModal();
    }

    // Función para abrir el modal en modo edición
    function openEditForm(id, nombre, edad, sexo) {
        // Setear los valores del formulario
        document.querySelector('input[name="id"]').value = id;
        document.querySelector('input[name="nombre"]').value = nombre;
        document.querySelector('input[name="edad"]').value = edad;

        // Marcar el radio button correspondiente
        const radios = document.querySelectorAll('input[name="sexo"]');
        radios.forEach(radio => {
            if (radio.value === sexo) {
                radio.checked = true;
            }
        });

        // Cambiar el título del modal
        document.querySelector('.form-header h2').textContent = 'Editar Árbitro';
        // Cambiar el texto del botón submit
        document.querySelector('.btn-submit').textContent = 'Actualizar Árbitro';
        // Mostrar el modal
        showModal();
    }

    // Función para mostrar el modal
    function showModal() {
        modalBackdrop.style.display = 'block';
        formModal.style.display = 'block';
        document.body.style.overflow = 'hidden'; // Prevenir scroll
    }

    // Función para ocultar el modal
    function hideModal() {
        modalBackdrop.style.display = 'none';
        formModal.style.display = 'none';
        document.body.style.overflow = 'auto'; // Restaurar scroll
    }

    // Event Listeners
    toggleFormBtn.addEventListener('click', openCreateForm);
    closeModalBtn.addEventListener('click', hideModal);
    modalBackdrop.addEventListener('click', hideModal);

    // Prevenir que el click en el modal lo cierre
    formModal.addEventListener('click', function (e) {
        e.stopPropagation();
    });

    // Hacer la función openEditForm global para que pueda ser llamada desde el HTML
    window.openEditForm = openEditForm;

    document.querySelectorAll('.delete-btn').forEach(btn => {
        btn.addEventListener('click', function () {
            const id = this.getAttribute('data-id');
            const nombre = this.getAttribute('data-nombre');

            if (confirm(`¿Estás seguro que deseas eliminar al árbitro ${nombre}?`)) {
                window.location.href = `${pageContext}/arbitros?action=delete&id=${id}`;
            }
        });
    });

    // Búsqueda de árbitros
    const searchInput = document.getElementById('searchInput');
    searchInput.addEventListener('input', function () {
        const searchTerm = this.value.toLowerCase();
        const rows = document.querySelectorAll('.players-table tbody tr');

        rows.forEach(row => {
            const nombre = row.cells[0].textContent.toLowerCase();
            if (nombre.includes(searchTerm)) {
                row.style.display = '';
            } else {
                row.style.display = 'none';
            }
        });
    });
});